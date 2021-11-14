public class Test {
        Patient patient = new Patient(true,true,true);
        Patient.Vaccine vaccine= Patient.Vaccine.SPUTNIC;
        public boolean Corona() {
        int probability = 50;
        if ( patient.getMask() ) probability -= 10; else probability += 10;
        if ( patient.getOnline() ) probability -= 20; else probability += 20;
        if ( patient.getPerill() ) probability -= 30; else probability += 30;
        if ( vaccine.getName().equals("") || vaccine.getName().equals("нет") ) probability += 40; else probability -= 40;
        if ( probability < 50 ) return false;
        else return true;
    }
    public int Antitela() {
        int count = 0;
        if( patient.getPerill() ) count += 50; else count = 0;
        if( vaccine.getName().equals("") || vaccine.getName().equals("нет") ) count = count; else count += 20;
        return count;
    }
    public void info() {
        System.out.println("Носит пациент маску: " + patient.getMask() +
                "\nПациент находится на удалёнке: " + patient.getOnline() +
                "\nПереболел ли пациент: " + patient.getPerill());
        if (vaccine.getName().equals("") || vaccine.getName().equals("нет"))
            System.out.println("Пациент не вакцинирован");
        else System.out.println("Пациент вакцинирован " + vaccine.getName() );
    }
    public void body(){
        info();
        if( Corona() ) System.out.println("К сожалению, пациент болен");
        else System.out.println("Поздравляем, пациент не болен");
        System.out.println("Cодержание антител: " + Antitela()+"%");
    }
}
