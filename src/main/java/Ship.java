/**
 * Classe Ship qui représente un navire dans le jeu de bataille navale
 */
public class Ship {

    // Les attributs privés de la classe Ship
    private int lifePoints;
    private String name;

    /**
     * Constructeur de la classe Ship
     *
     * @param length La longueur du navire
     * @param name   Le nom du navire
     */
    public Ship(int length, String name) {
        this.lifePoints = length;
        this.name = name;
    }

    /**
     * Méthode pour vérifier si le navire a été coulé
     *
     * @return true si le navire a été coulé, false sinon
     */
    public boolean hasBeenSunk() {
        return this.lifePoints == 0;
    }

    /**
     * Méthode pour simuler une attaque sur le navire. Réduit les points de vie du navire de 1.
     */
    public void takeAHit() {
        if (this.lifePoints > 0) {
            this.lifePoints--;
        }
    }

    /**
     * Méthode pour obtenir les points de vie actuels du navire
     *
     * @return Les points de vie actuels du navire
     */
    public int getLifePoints() {
        return this.lifePoints;
    }

    /**
     * Méthode pour obtenir une représentation sous forme de chaîne du navire
     *
     * @return Une représentation sous forme de chaîne du navire
     */
    @Override
    public String toString() {
        return this.name + " (" + this.lifePoints + " life points remaining)";
    }
}
