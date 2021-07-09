package projetofinalmodulo1;

/*
 * @author Ruan Silva
 */
public class Alunos {
    private String recebeNome;
    private double nota1,nota2,nota3,nota4,pontoExtra,media;

    public Alunos(String recebeNome, double nota1, double nota2, double nota3, double nota4, double pontoExtra) {
        this.recebeNome = recebeNome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.pontoExtra = pontoExtra;
    }
    public Alunos(){}

    public String getRecebeNome() {
        return recebeNome;
    }

    public void setRecebeNome(String recebeNome) {
        this.recebeNome = recebeNome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double bota3) {
        this.nota3 = bota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getPontoExtra() {
        return pontoExtra;
    }

    public void setPontoExtra(double pontoExtra) {
        this.pontoExtra = pontoExtra;
    }
    
    //i-- RECEBE E TRATA A MÉDIA NO CASO DE ELA EXCEDER O VALOR '10'--//
    public double getMedia() {
        media = (this.nota1+this.nota2+this.nota3+this.nota4)/4+this.pontoExtra;
        if(media>10){
            this.media = 10;
        }
        return media;
    }
    //f-- RECEBE E TRATA A MÉDIA NO CASO DE ELA EXCEDER O VALOR '10'--//

    public void setMedia(double media) {
        this.media = media;
    }
    
}
