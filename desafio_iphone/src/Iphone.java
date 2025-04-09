public class Iphone implements Browser, PlayerMusic, Telephone {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.call();
        iphone.answer();
        iphone.startVoiceMail();
        iphone.playMusic();
        iphone.pauseMusic();
        iphone.selectMusic();
        iphone.showPage();
        iphone.addNewTab();
        iphone.refreshPage();

    }

    @Override
    public void call() {

        System.out.println("Ligando...");

    }

    @Override
    public void answer() {
        System.out.println("Atendendo chamada!");

    }

    @Override
    public void startVoiceMail() {

        System.out.println("Iniciando mensagem de voz!");

    }

    @Override
    public void playMusic() {

        System.out.println("Tocando música!");

    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando música!");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando música!");

    }

    @Override
    public void showPage() {
        System.out.println("Exibindo página!");

    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba!");

    }

    @Override
    public void refreshPage() {

        System.out.println("Atualizando página!");

    }

}
