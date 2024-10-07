public abstract class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean canWalk() {
        return true;
    }

    public boolean canSwim() {
        return false;
    }

    public Animal(String name) {
        this.name = name;
    }

    
}