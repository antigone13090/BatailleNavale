package main.java;

/**
 * Classe Cell qui représente une cellule du plateau de jeu dans le jeu de bataille navale
 */
public class Cell {

    // Les attributs privés de la classe Cell
    private Ship ship;
    private boolean hasBeenShot;

    /**
     * Constructeur de la classe Cell
     */
    public Cell() {
        this.ship = null;
        this.hasBeenShot = false;
    }

    /**
     * Méthode pour obtenir le navire actuellement dans cette cellule
     *
     * @return Le navire actuellement dans cette cellule
     */
    public Ship getShip() {
        return this.ship;
    }

    /**
     * Méthode pour définir le navire actuellement dans cette cellule
     *
     * @param ship Le navire à placer dans cette cellule
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    /**
     * Méthode pour vérifier si la cellule a été touchée par un tir
     *
     * @return true si la cellule a été touchée, false sinon
     */
    public boolean hasBeenShot() {
        return this.hasBeenShot;
    }

    /**
     * Méthode pour prendre un tir. Si un navire est présent, réduit ses points de vie.
     *
     * @return Le résultat du tir
     */
    public ShotResult takeAShot() {
        this.hasBeenShot = true;
        if (this.ship != null) {
            this.ship.takeAHit();
            if (this.ship.hasBeenSunk()) {
                return ShotResult.SUNK;
            } else {
                return ShotResult.HIT;
            }
        } else {
            return ShotResult.MISS;
        }
    }

    /**
     * Méthode pour vérifier si un navire est présent dans la cellule
     *
     * @return true si un navire est présent, false sinon
     */
    public boolean hasShip() {
        return this.ship != null;
    }
}
