package weekTen.labTen;

public abstract class Character {
    public static final int MAX_HEALTH = 100;

    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = Math.min(health, MAX_HEALTH); // Ensure health doesn't exceed MAX_HEALTH
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, MAX_HEALTH)); // Ensure health stays between 0 and MAX_HEALTH
    }

    public boolean isAlive() {
        return health > 0;
    }

    // Abstract method to be implemented by subclasses
    public abstract void attack();
}

