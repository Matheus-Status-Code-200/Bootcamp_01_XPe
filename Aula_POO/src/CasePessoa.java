public class CasePessoa {
        public int identificador;
        public String CPF;
        public String nome;
        public double altura;
        public double peso;
        public int ano_nascimento;

        public CasePessoa() {
        }



        public CasePessoa(int id, String CPF, String nome, double altura, double peso, int ano_nascimento) {
            this.identificador = id;
            this.CPF = CPF;
            this.nome = nome;
            this.altura = altura;
            this.peso = peso;
            this.ano_nascimento = ano_nascimento;
        }

        public String retornaPessoaCase() {
            StringBuilder sb = new StringBuilder();

            switch (identificador) {
                case 0:
                    sb.append("Nome: ").append(this.nome).append("\n");
                    if (CPF != null && !CPF.isEmpty()) {
                        sb.append("CPF: ").append(this.CPF).append("\n");
                    }
                    if (altura != 0.0) {
                        sb.append("Altura: ").append(this.altura).append("\n");
                    }
                    if (ano_nascimento != 0) {
                        sb.append("Aniversário: ").append(this.ano_nascimento).append("\n");
                    }
                    if (peso != 0.0) {
                        sb.append("Peso: ").append(this.peso).append("\n");
                    }
                    break;
                default:
                    sb.append("Identificador: ").append(this.identificador).append("\n");
                    sb.append("Nome: ").append(this.nome).append("\n");
                    if (CPF != null && !CPF.isEmpty()) {
                        sb.append("CPF: ").append(this.CPF).append("\n");
                    }
                    if (altura != 0.0) {
                        sb.append("Altura: ").append(this.altura).append("\n");
                    }
                    if (ano_nascimento != 0) {
                        sb.append("Aniversário: ").append(this.ano_nascimento).append("\n");
                    }
                    if (peso != 0.0) {
                        sb.append("Peso: ").append(this.peso).append("\n");
                    }
                    break;
            }

            return "\n"+"Retorno do case.....\n"+sb.toString();
        }
    }
