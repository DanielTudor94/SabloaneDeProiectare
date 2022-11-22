package Laborator1;


import java.util.Collection;

public class Carte {
        String titlu;
        Cuprins cup;
        private Collection<Author> aut;

        public Carte(String titlu, Cuprins cup, Collection <Author> aut){
            this.aut = aut;
            this.titlu = titlu;
            this.cup = cup;
        }

        public Cuprins getCup() {
            return cup;
        }

        public Collection<Author> getAut() {
            return aut;
        }

        public String getTitlu() {
            return titlu;
        }

        public void setTitlu(String titlu) {
            this.titlu = titlu;
        }
    }

