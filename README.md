# Terminal Bank Account Simulator

This is a simple terminal-based application that simulates the creation of a bank account using Java. The application gathers user input via the terminal using the Scanner class and ensures that the input is valid through basic validation checks. Finally, it outputs a friendly message informing the user that his account was created.

## Table of Contents

- [Tools](#tools)
- [Installation & Running the Application](#installation--running-the-application)
- [How to Use The Project](#how-to-use-the-project)
- [Challenges Faced](#challenges-faced)
- [Next Steps](#next-steps)
- [Credits](#credits)

## Tools
For this project, I used:
- Java
- Scanner class, for gathering user input

This project was an opportunity to practice Java fundamentals and terminal-based user interactions.

## Installation & Running the Application

You can clone this project to your local machine with this command on your CLI:

- HTTPS

```bash
$ git clone https://github.com/Will-Andrade/terminal-bank-account-simulator.git
```

- SSH

```bash
$ git clone git@github.com:Will-Andrade/terminal-bank-account-simulator.git
```

To compile and run the application, use the following commands:

```bash
$ cd terminal-bank-account-simulator
$ javac TerminalAccount.java
$ java TerminalAccount
```

## How to Use The Project

After running the application, you'll be prompted to input various details for creating a bank account:

- Full name: Your full name.
- Agency number: A valid integer representing your agency number.
- Account number: A valid integer representing your account number.
- Balance: A double value representing your initial account balance.

Demo:
```bash
Please input your full name!
Willian Andrade
Please input the agency number!
120521
Please input the account number!
00082
Please input your balance!
12800.93
Hello Willian Andrade, thank you for creating an account in our bank, your agency is 120521, account 00082 and your balance 12.800,93 is already available for withdraw.
```

## Challenges Faced

One challenge faced was ensuring valid user input with a simple form of exception handling. I managed to do this by checking that the full name consists only of alphabetic characters and spaces using a RegExp pattern and I managed to validate the agency number, account number, and balance with simple if statements and **IllegalArgumentException**.

## Next Steps

- Add more features such as deposit, withdrawal, and transfer functionalities.
- Implement more advanced input validation and error handling, maybe creating an app wide exception catcher and handle them from there.
- Create unit tests to ensure the reliability of the input validation methods.
- Format the balance of the user based on their locale

## Credits

The idea for this project came from the Digital Innovation One (DIO) Java with Spring Boot bootcamp. The original challenge features can be read [here](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe) (Brazillian Portuguese README 🇧🇷) but other than that, all code was created by me, Willian Andrade.
