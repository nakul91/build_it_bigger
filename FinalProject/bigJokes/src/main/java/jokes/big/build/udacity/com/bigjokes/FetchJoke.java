package jokes.big.build.udacity.com.bigjokes;

public class FetchJoke {

    public String getJoke() {

        int max = 10;

        switch ((int)Math.floor(Math.random()* max)) {
            case 0:
                return "best joke ";
            case 2:
                return "worst joke";
            case 3:
                return "consider joke";
            case 4:
                return "Awww";
            case 5:
                return "ha ha !!";
            case 6:
                return "Nice";
            case 7:
                return "great joke";
            case 8:
                return "uff really!!";
            case 9:
                return "lol...";

            default:
                return "rofl..";



        }

    }
}
