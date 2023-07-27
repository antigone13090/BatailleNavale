package main.java;

/**
 * Classe Coordinates qui représente les coordonnées dans une grille 2D
 */
public class Coordinates {

    // Les attributs privés de la classe Coordinates
    private int x;
    private int y;

    /**
     * Constructeur de la classe Coordinates
     *
     * @param x La coordonnée x
     * @param y La coordonnée y
     */
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Méthode pour obtenir la valeur de la coordonnée x
     *
     * @return La valeur de x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Méthode pour obtenir la valeur de la coordonnée y
     *
     * @return La valeur de y
     */
    public int getY() {
        return this.y;
    }

    /**
     * Méthode pour comparer cette instance de Coordinates avec une autre
     *
     * @param o L'autre objet à comparer
     * @return true si les deux objets sont égaux, false sinon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (x != that.x) return false;
        return y == that.y;
    }

    /**
     * Méthode pour obtenir une représentation sous forme de chaîne de cette instance de Coordinates
     *
     * @return Une représentation sous forme de chaîne de cette instance de Coordinates
     */
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    /**
     * Méthode pour ajouter ces coordonnées à d'autres coordonnées
     *
     * @param c Les autres coordonnées à ajouter
     * @return Une nouvelle instance de Coordinates qui est la somme de cette instance et de c
     */
    public Coordinates add(Coordinates c) {
        return new Coordinates(this.x + c.getX(), this.y + c.getY());
    }
}
