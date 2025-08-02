🎮 Tic-Tac-Toe Game in Java (Swing GUI)
A simple desktop-based Tic-Tac-Toe game developed using Java AWT & Swing. It allows two players to play turn by turn, with win/draw detection and options to reset or exit the game.

📌 Features
2-Player turn-based game

GUI built using AWT components

Win and Draw detection logic

Reset button to replay

Exit button to close application

Clean and easy-to-use layout

🛠️ Technologies Used
Java (JDK 8+)

AWT (Abstract Window Toolkit)

Swing for UI interaction (via JOptionPane)

🚀 How to Run
Ensure Java is installed on your machine.

Copy the code into a file named TicTacToe.java.

Compile the code:
javac TicTacToe.java
Run the compiled class:
java TicTacToe

🎨 UI Layout
3x3 Grid: Built using Button objects placed manually using setBounds.

Title: "TIC-TAC-TOE" displayed at the top.

Reset Button: Bottom-right corner to clear the board.

Exit Button: Bottom-left corner to quit the game.

🧠 Game Logic
The game alternates turns between Player 1 (X) and Player 2 (O).

After each move:
A check is run to determine if either player has won.
If all buttons are clicked and no one wins, it's a draw.
Uses JOptionPane.showMessageDialog for result notifications.

🧼 Future Improvements (Suggestions)
Add a scoreboard to track multiple games.


Improve layout using GridLayout or JPanel.
Add player name input.
Add sound effects on click.
Highlight the winning combination.

👨‍💻 Author
Hamadullah Odho
Java Developer | Computer Science Student from Pakistan

📄 License
This project is for educational purposes and free to use or modify.
