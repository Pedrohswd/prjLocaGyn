/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.enumeracao.TipoDeCliente;
import static com.locagyn.enumeracao.TipoDeCliente.PESSOA_FISICA;
import static com.locagyn.enumeracao.TipoDeCliente.PESSOA_JURIDICA;
import com.locagyn.modelos.Cliente;
import com.locagyn.persistencia.ClienteDao;
import com.locagyn.persistencia.IClienteDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Felps
 */
public class ClienteControle implements IClienteControle {

    IClienteDao clientePersistencia = null;

    public ClienteControle() {
        this.clientePersistencia = new ClienteDao();
    }

    private boolean buscarCliente(String cpf_cnpj, TipoDeCliente tipoDoCliente) throws Exception {
        try {
            ArrayList<Cliente> listagem = clientePersistencia.listagem(tipoDoCliente);
            Iterator<Cliente> lista = listagem.iterator();
            if (tipoDoCliente == PESSOA_FISICA) {
                while (lista.hasNext()) {
                    Cliente aux = lista.next();
                    if (aux.getCpf().equalsIgnoreCase(cpf_cnpj)) {
                        return true;
                    }
                }
            }
            if (tipoDoCliente == PESSOA_JURIDICA) {
                while (lista.hasNext()) {
                    Cliente aux = lista.next();
                    if (aux.getCnpj().equalsIgnoreCase(cpf_cnpj)) {
                        return true;
                    }
                }
            }

            return false;
        } catch (Exception error) {
            throw error;
        }
    }

    @Override
    public void incluir(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {

        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_FISICA)) {
            if (("00000000000").equals(objeto.getCpf())
                    || ("11111111111").equals(objeto.getCpf())
                    || ("22222222222").equals(objeto.getCpf()) || ("33333333333").equals(objeto.getCpf())
                    || ("44444444444").equals(objeto.getCpf()) || ("55555555555").equals(objeto.getCpf())
                    || ("66666666666").equals(objeto.getCpf()) || ("77777777777").equals(objeto.getCpf())
                    || ("88888888888").equals(objeto.getCpf()) || ("99999999999").equals(objeto.getCpf())
                    || ("".equals(objeto.getCpf())) || ((objeto.getCpf().length() != 11))) {
                throw new Exception("CPF INVÁLIDO");

            } else {
                char digito10, digito11;
                int sm, i, r, num, peso;

                sm = 0;
                peso = 10;
                for (i = 0; i < 9; i++) {
                    // converte o i-esimo caractere do CPF em um numero:
                    // por exemplo, transforma o caractere '0' no inteiro 0
                    // (48 eh a posicao de '0' na tabela ASCII)
                    num = (int) (objeto.getCpf().charAt(i) - 48);
                    sm = sm + (num * peso);
                    peso = peso - 1;
                }

                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11)) {
                    digito10 = '0';
                } else {
                    digito10 = (char) (r + 48); // converte no respectivo caractere numerico
                }
                // Calculo do 2o. Digito Verificador
                sm = 0;
                peso = 11;
                for (i = 0; i < 10; i++) {
                    num = (int) (objeto.getCpf().charAt(i) - 48);
                    sm = sm + (num * peso);
                    peso = peso - 1;
                }

                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11)) {
                    digito11 = '0';
                } else {
                    digito11 = (char) (r + 48);
                }
                if (!((digito10 == objeto.getCpf().charAt(9)) && (digito11 == objeto.getCpf().charAt(10)))) {
                    throw new Exception("cpf inválido");
                }
                // Verifica se os digitos calculados conferem com os digitos informados.
            }
        }

        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_FISICA)) {
            //if (buscarCliente(objeto.getCpf(), tipoDoCliente)) {
            //    throw new Exception("Cliente já foi cadastrado(a)");
            //}
            String aux = objeto.getCpf();
            //if ("".equals(objeto.getCpf())) {
            //    throw new Exception("Digite um cpf válido.");
            //}
            if ("".equals(objeto.getCpf())) throw new Exception("Insira o CPF.");
            if ("".equals(objeto.getNome())) throw new Exception("Insira um Nome");           
            if ("".equals(objeto.getIdentidade())) throw new Exception("Insira a identidade.");
            if ("".equals(objeto.getEmail())) throw new Exception("Insira o email.");
            
            
            if ("".equals(objeto.getEndereco().getLongradouro())) throw new Exception("Insira o logradouro.");
            if ("".equals(objeto.getEndereco().getComplemento())) throw new Exception("Insira o complemento.");
            if ("".equals(objeto.getEndereco().getBairro())) throw new Exception("Insira o bairro.");
            if ("".equals(objeto.getEndereco().getCidade())) throw new Exception("Insira a cidade.");
            
        }

        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_JURIDICA)) {
            if (buscarCliente(objeto.getCnpj(), tipoDoCliente)) {
                throw new Exception("Cliente já foi cadastrado(a)");
            }
            String aux = objeto.getCnpj();
            if ("".equals(objeto.getCnpj())) {
                throw new Exception("Digite um nome válido.");
            }
        }
        clientePersistencia.incluir(objeto, tipoDoCliente);

    }

    @Override
    public void alterar(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {

        /*if (tipoDoCliente.equals(TipoDeCliente.PESSOA_FISICA)) {
            if (buscarCliente(objeto.getCpf(), tipoDoCliente)) {
                throw new Exception("Cliente já foi cadastrado(a)");
            }
            String aux = objeto.getCpf();
            if ("".equals(objeto.getCpf())) {
                throw new Exception("Digite um cpf válido.");
            }
        }
        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_JURIDICA)) {
            if (buscarCliente(objeto.getCnpj(), tipoDoCliente)) {
                throw new Exception("Cliente já foi cadastrado(a)");
            }
            String aux = objeto.getCnpj();
            if ("".equals(objeto.getCnpj())) {
                throw new Exception("Digite um nome válido.");
            }
        }
         */
        clientePersistencia.alterar(objeto, tipoDoCliente);

    }

    @Override
    public ArrayList<Cliente> listagem(TipoDeCliente tipoDoCliente) throws Exception {

        return clientePersistencia.listagem(tipoDoCliente);

    }

    @Override
    public Cliente buscar(int id, TipoDeCliente tipoDoCliente) throws Exception {

        return clientePersistencia.buscar(id, tipoDoCliente);

    }

    @Override
    public void verTxt() throws Exception {

        clientePersistencia.verTxt();
    }
}
