package pets_amok;

public class RobotCat extends RobotPet{
    public RobotCat(String petName, String petDescription) {
        super(petName, petDescription);
    }

    @Override
    public void getsOiled() {
        int oil=this.getPetOil();
        oil++;
        this.setPetOil(oil);
    }
}
