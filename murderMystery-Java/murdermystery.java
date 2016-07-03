class Module1 {
    
    static void Main() {
        Console.WriteLine((ScriptEngineMajorVersion + (" " + ScriptEngineBuildVersion)));
        Threading.Thread.Sleep(500);
        Console.Clear();
        mainStory.openingStage();
    }
}
class mainStory {
    
    private string name;
    
    static void openingStage() {
        Console.ForegroundColor = ConsoleColor.DarkMagenta;
        Console.WriteLine("-=====================================================-");
        Console.WriteLine("-================== Murder Mystery ===================-");
        Console.WriteLine("-=====================================================-");
        Threading.Thread.Sleep(2000);
        Console.Clear();
        mainStory.nameCorrect();
    }
    
    static void nameCorrect() {
        int selection;
        Console.ForegroundColor = ConsoleColor.DarkBlue;
        Console.WriteLine("Hello there, what is your name?");
        name = Console.ReadLine;
        Console.WriteLine("Do you wish to continue with this name?");
        Console.WriteLine("1. Yes");
        Console.WriteLine("2. No");
        selection = Console.ReadLine;
        if ((selection == 1)) {
            Console.WriteLine(("Ahh. Hello " 
                            + (name + ", we have a case for you. It is a murder case, with the death of Barack Obama.")));
            mainStory.startGamer();
        }
        else {
            mainStory.nameCorrect();
        }
        
    }
    
    static void startGamer() {
        int selection;
        Console.WriteLine(("Will you help us, " 
                        + (name + "?")));
        Console.WriteLine("1. Yes");
        Console.WriteLine("2. No");
        selection = Console.ReadLine;
        if ((selection == 1)) {
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("I knew you had it in you! Let us get the list of suspects.");
            Threading.Thread.Sleep(3000);
            Console.Clear();
            mainStory.suspects();
        }
        else {
            Console.Clear();
            Threading.Thread.Sleep(500);
            quitRestart.restartQuitA();
        }
        
    }
    
    static void suspects() {
        int suspectPick;
        Console.ForegroundColor = ConsoleColor.Yellow;
        Console.WriteLine("This is the list of suspects so far:");
        Console.WriteLine("Please select a number to view their alibi:");
        Console.WriteLine("1. David Cameron");
        Console.WriteLine("2. Brendon Urie");
        Console.WriteLine("3. Donald Trump");
        Console.WriteLine("4. Hatsune Miku");
        Console.WriteLine("5. Kazuto Kirigaya");
        Console.WriteLine("Press 6 (or higher) to continue and list the suspects you\'d like to bring in and question.");
        suspectPick = Console.ReadLine;
        if ((suspectPick == 1)) {
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.DarkRed;
            Console.WriteLine("I was at Number 10 Downing Street, adressing the whole of the UK, on TV! How could I kill someone wit" +
                "h a M1911, when the whole of England, Wales and Scotland can confirm I was on TV 10 minutes after th" +
                "e killing!");
            Threading.Thread.Sleep(4000);
            Console.Clear();
            mainStory.suspects();
        }
        else if ((suspectPick == 2)) {
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.DarkRed;
            Console.WriteLine("I was busy recording a song for \'Panic! At The Disco\', my producer can confirm this.");
            Threading.Thread.Sleep(4000);
            Console.Clear();
            mainStory.suspects();
        }
        else if ((suspectPick == 3)) {
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.DarkRed;
            Console.WriteLine("I was in America, I must have been, how could I be in England when I have to be in America, campagnin" +
                "g");
            Threading.Thread.Sleep(4000);
            Console.Clear();
            mainStory.suspects();
        }
        else if ((suspectPick == 4)) {
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.DarkRed;
            Console.WriteLine("I was on the radio in Japan, all my fans can prove it!");
            Threading.Thread.Sleep(4000);
            Console.Clear();
            mainStory.suspects();
        }
        else if ((suspectPick == 5)) {
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.DarkRed;
            Console.WriteLine("I was playing ALO (ALfhiem Online). The game records can confirm this.");
            Threading.Thread.Sleep(4000);
            Console.Clear();
            mainStory.suspects();
        }
        else {
            Console.Clear();
            Threading.Thread.Sleep(1000);
            mainStory.suspectQuestingStart();
        }
        
    }
    
    static void suspectQuestingStart() {
        int suspectsIn;
        Console.Clear();
        Console.ForegroundColor = ConsoleColor.Blue;
        Console.WriteLine("Please input the numbers of the Suspects you\'d wish to bring in for questioning.");
        Console.WriteLine("Type \'0\' to return to the suspect list and evidence list.");
        Console.WriteLine("Type the numbers of the suspects in order and as one whole number (\'67\' if suspect numbers 6/7 existe" +
            "d)");
        suspectsIn = Console.ReadLine;
        if ((suspectsIn == 0)) {
            Console.Clear();
            Threading.Thread.Sleep(500);
            mainStory.suspects();
        }
        else if (((suspectsIn == 13) 
                    || 31)) {
            Console.Clear();
            Threading.Thread.Sleep(1000);
        }
        else {
            Console.WriteLine("These numbers you have put in are either wrong or make no sense.");
            quitRestart.restartQuitB();
        }
        
    }
}
class quitRestart {
    
    static void restartQuitA() {
        int selection;
        Console.ForegroundColor = ConsoleColor.DarkRed;
        Console.WriteLine("Ahh, you don\'t have it in you.");
        Console.WriteLine("Please enter what you would like to do:");
        Console.WriteLine("1. Restart the \'Murder Mystery\'");
        Console.WriteLine("2. Quit the \'Murder Mystery\'");
        selection = Console.ReadLine;
        if ((selection == 1)) {
            Console.Clear();
            quitRestart.openingStage();
        }
        else {
            Console.WriteLine("Quitting...");
            Threading.Thread.Sleep(1000);
        }
        
    }
    
    static void restartQuitB() {
        int selection;
        Console.ForegroundColor = ConsoleColor.DarkRed;
        Console.WriteLine("You have took in the wrong set of Suspects");
        Console.WriteLine("Please enter what you would like to do:");
        Console.WriteLine("1. Restart that section of \'Murder Mystery\'");
        Console.WriteLine("2. Restart the \'Murder Mystery\' completely");
        Console.WriteLine("3. Quit the \'Murder Mystery\'");
        selection = Console.ReadLine;
        if ((selection == 1)) {
            Console.Clear();
            quitRestart.suspectQuestingStart();
        }
        else if ((selection == 2)) {
            Console.Clear();
            quitRestart.openingStage();
        }
        else {
            Console.WriteLine("Quitting...");
            Threading.Thread.Sleep(1000);
        }
        
    }
}