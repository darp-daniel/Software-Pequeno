
package desafio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno03
 */
public class Desafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        String email;
        String nome;
        String senha;
        String titulo;
        ArrayList <Tarefas> tf = new ArrayList();
        int i;
        boolean status = true;
            while(run){
                System.out.println("==Bem - vindo ao software DidList==\n"
                    + "Por favor utilize as opções abaixo para navegar no softaware\n"
                    + "Opção 1: Criar Usuários\n"
                    + "Opção 2: Criar tarefas\n"
                    + "Opção 3: Fechar o programa\n");
                    String op = sc.nextLine();
                switch(op){
                    case "1":
                            Usuario u = new Usuario();
                            System.out.println("Digite seu email");
                            email = sc.nextLine();
                            System.out.println("Digite seu nome");
                            nome = sc.nextLine();
                            System.out.println("Digite sua senha");
                            senha = sc.nextLine();
                            u.atribuirEmail(email);
                            u.atribuirNome(nome);
                            u.atribuirSenha(senha);
                            System.out.println("Usuário " + u.mostrarNome() + " cadastrado com sucesso, seu email é " + u.mostrarEmail() + " e sua senha é " + u.mostrarSenha());
                            break;
                    case "2":
                            Tarefas t = new Tarefas();
                            System.out.println("Digite o assunto da tarefa ");
                            titulo = sc.nextLine();
                            t.atribuirTitulo(titulo);
                            t.atribuirStatus(status);
                            tf.add(t);
                            for(i = 0;i < tf.size(); i++){
                                System.out.println("Suas tarefas: " + tf.get(i).mostrarTitulo() + " status: " + tf.get(i).mostrarStatus());
                            }
                            break;
                    case "3":
                            System.exit(0);
                            break;
                    default:
                            System.out.println("Opção inválida");
                        }
                }
            }
        
    }
    

