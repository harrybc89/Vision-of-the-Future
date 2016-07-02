Module Module1
    Sub Main()
        Console.WriteLine(ScriptEngineMajorVersion & ScriptEngineBuildVersion)
        Threading.Thread.Sleep(500)
        Console.Clear()
        openingStage()
    End Sub
End Module

Module mainStory

    Dim name As String

    Sub openingStage()

        Dim selection As Integer

        Console.ForegroundColor = ConsoleColor.DarkMagenta

        Console.WriteLine("-=====================================================-")
        Console.WriteLine("-================== Murder Mystery ===================-")
        Console.WriteLine("-=====================================================-")
        Threading.Thread.Sleep(2000)

        Console.Clear()

        Console.ForegroundColor = ConsoleColor.DarkBlue

        Console.WriteLine("Hello there, what is your name?")
        name = Console.ReadLine

        Console.WriteLine("Ahh. Hello " & name & ", we have a case for you. It is a murder case, with the death of Barack Obama.")
        Console.WriteLine("Will you help us, " & name & "?")
        Console.WriteLine("1. Yes")
        Console.WriteLine("2. No")
        selection = Console.ReadLine

        If selection = 1 Then

            Console.ForegroundColor = ConsoleColor.Yellow

            Console.WriteLine("I knew you had it in you! Let us get the list of suspects.")
            Threading.Thread.Sleep(3000)
            Console.Clear()
            suspects()
        Else
            Console.Clear()
            Threading.Thread.Sleep(500)
            restartQuitA()
        End If


    End Sub

    Sub suspects()

        Dim suspectPick As Integer

        Console.ForegroundColor = ConsoleColor.Yellow

        Console.WriteLine("This is the list of suspects so far:")
        Console.WriteLine("Please select a number to view their alibi:")
        Console.WriteLine("1. David Cameron")
        Console.WriteLine("2. Brendon Urie")
        Console.WriteLine("3. Donald Trump")
        Console.WriteLine("4. Hatsune Miku")
        Console.WriteLine("5. Kazuto Kirigaya")
        Console.WriteLine("Press 6 (or higher) to continue and list the suspects you'd like to bring in and question.")
        suspectPick = Console.ReadLine

        If suspectPick = 1 Then
            Console.WriteLine("I was at Number 10 Downing Street, adressing the whole of the UK, on TV! How could I kill someone with a M1911, when the whole of England, Wales and Scotland can confirm I was on TV 10 minutes after the killing!")
            Threading.Thread.Sleep(4000)
            Console.Clear()
            suspects()
        ElseIf suspectPick = 2 Then
            Console.WriteLine("I was busy recording a song for 'Panic! At The Disco', my producer can confirm this.")
            Threading.Thread.Sleep(4000)
            Console.Clear()
            suspects()
        ElseIf suspectPick = 3 Then
            Console.WriteLine("I was in America, I must have been, how could I be in England when I have to be in America, campagning")
            Threading.Thread.Sleep(4000)
            Console.Clear()
            suspects()
        ElseIf suspectPick = 4 Then
            Console.WriteLine("I was on the radio in Japan, all my fans can prove it!")
            Threading.Thread.Sleep(4000)
            Console.Clear()
            suspects()
        ElseIf suspectPick = 5 Then
            Console.WriteLine("I was playing ALO (ALfhiem Online). The game records can confirm this.")
            Threading.Thread.Sleep(4000)
            Console.Clear()
            suspects()
        Else
            Console.Clear()
            Threading.Thread.Sleep(1000)
            suspectQuestingStart()


        End If

    End Sub

    Sub suspectQuestingStart()

        Dim suspectsIn As Integer

        Console.WriteLine("Please input the numbers of the Suspects you'd wish to bring in for questioning.")
        Console.WriteLine("Type '0' to return to the suspect list and evidence list.")
        Console.WriteLine("Type the numbers of the suspects in order and as one whole number ('67' if suspect numbers 6/7 existed)")

        suspectsIn = Console.ReadLine

        If suspectsIn = 0 Then
            Console.Clear()
            Threading.Thread.Sleep(500)
            suspects()
        ElseIf suspectsIn = 13 Then
            Console.Clear()
            Threading.Thread.Sleep(1000)

        Else
            Console.WriteLine("These numbers you have put in are either wrong or make no sense.")
            restartQuitB()

        End If




    End Sub
End Module

Module quitRestart

    Sub restartQuitA()
        Dim selection As Integer

        Console.ForegroundColor = ConsoleColor.DarkRed

        Console.WriteLine("Ahh, you don't have it in you.")
        Console.WriteLine("Please enter what you would like to do:")
        Console.WriteLine("1. Restart the 'Murder Mystery'")
        Console.WriteLine("2. Quit the 'Murder Mystery'")
        selection = Console.ReadLine

        If selection = 1 Then
            Console.Clear()
            openingStage()
        Else
            Console.WriteLine("Quitting...")
            Threading.Thread.Sleep(1000)
            End
        End If

    End Sub

    Sub restartQuitB()
        Dim selection As Integer

        Console.ForegroundColor = ConsoleColor.DarkRed

        Console.WriteLine("You have took in the wrong set of Suspects")
        Console.WriteLine("Please enter what you would like to do:")
        Console.WriteLine("1. Restart that section of 'Murder Mystery'")
        Console.WriteLine("2. Restart the 'Murder Mystery' completely")
        Console.WriteLine("3. Quit the 'Murder Mystery'")
        selection = Console.ReadLine

        If selection = 1 Then
            Console.Clear()
            suspectQuestingStart()
        ElseIf selection = 2 Then
            Console.Clear()
            openingStage()
        Else
            Console.WriteLine("Quitting...")
            Threading.Thread.Sleep(1000)
            End
        End If
    End Sub
End Module

