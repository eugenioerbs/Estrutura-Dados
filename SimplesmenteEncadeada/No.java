package SimplesmenteEncadeada;

public class No {
    private Aluno aluno;
    private No proximo;

    public No (Aluno alunoVari) {
        setAluno(alunoVari);
        this.proximo = null;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    
}
