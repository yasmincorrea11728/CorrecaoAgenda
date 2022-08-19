public class Contato {

   static int numeroDeContas = 0;

   private int codigo;
   private String nome;
   private String email;
   private String telefone;

   public Contato() {

   }

   public Contato(int codigo, String nome, String email, String telefone) {
       this.codigo = codigo;
       this.nome = nome;
       this.email = email;
       this.telefone = telefone;
   }

   public void setCodigo(int codigo) {
       this.codigo = codigo;

   }

   public int getCodigo() {
       return codigo;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public String getTelefone() {
       return telefone;
   }

   public void setTelefone(String telefone) {
       this.telefone = telefone;
   }

   @Override
   public String toString() {
       return "Contato [codigo=" + codigo + ", email=" + email + ", nome=" + nome + ", telefone=" + telefone + "]";
   }

}