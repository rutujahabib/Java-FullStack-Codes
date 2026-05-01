

public class ExecutionSpeaker {
    public static void main(String[] args) {
        Speaker s = new Speaker();
        s.name = "JBL";
        s.price = 5000;
        s.SoundQuality = "Excellent";
        s.wifi = true;
        s.range = 10.5;
        System.out.println("Speaker Name: " + s.name);
        System.out.println("Speaker Price: " + s.price);
        System.out.println("Speaker Sound Quality: " + s.SoundQuality);
        System.out.println("Speaker Wifi: " + s.wifi);
        System.out.println("Speaker Range: " + s.range);

        Speaker s1 = new Speaker();
        s1.name = "Sony";
        s1.price = 7000;
        s1.SoundQuality = "Good";
        s1.wifi = false;
        s1.range = 8.0;
        System.out.println("Speaker Name: " + s1.name);
        System.out.println("Speaker Price: " + s1.price);
        System.out.println("Speaker Sound Quality: " + s1.SoundQuality);
        System.out.println("Speaker Wifi: " + s1.wifi);
        System.out.println("Speaker Range: " + s1.range);

    }
}


// Speaker Name: JBL
// Speaker Price: 5000
// Speaker Sound Quality: Excellent
// Speaker Wifi: true
// Speaker Range: 10.5


// Speaker Name: JBL
// Speaker Price: 5000
// Speaker Sound Quality: Excellent
// Speaker Wifi: true
// Speaker Range: 10.5
// Speaker Name: Sony
// Speaker Price: 7000
// Speaker Sound Quality: Good
// Speaker Wifi: false
// Speaker Range: 8.0