public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(93);
        boss.setHealth(300);
        boss.setDefenceType("Физическая");
        System.out.println("Урон: " + boss.getDamage() + "\nЗдоровье: " + boss.getHealth() + "\nТип защиты: " + boss.getDefenceType() );
    }
}