package aparelhos;

import navegadorInternet.NavegadorInternet;
import reprodutorMusica.ReprodutorMusica;
import telefone.AparelhoTelefone;

public class Iphone implements NavegadorInternet, ReprodutorMusica, AparelhoTelefone {

    @Override
    public void ligar() {
        System.out.println("Ligando para outro telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba ao navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página...");
    }

}
