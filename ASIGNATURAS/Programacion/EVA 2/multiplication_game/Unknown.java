package multiplication_game;

// Clase Incognita
class Incognita {
    private String tipo;
    private String texto;

    // Constructor
    public Incognita(String tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
    }

    // Métodos
    public String getTipo() {
        return tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Incognita incognita = (Incognita) obj;
        return tipo.equals(incognita.tipo) && texto.equals(incognita.texto);
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Texto: " + texto;
    }
}