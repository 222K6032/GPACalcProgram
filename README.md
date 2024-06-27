# GPA Calc Program

This program is designed to calculate the GPA (Grade Point Average) of students based on their grades and credits obtained. The program is written in Java and provides output in Japanese.

## Features

- Input the number of credits obtained for each grade from enrollment until the previous year.
- Input the target number of credits for each grade for the current year.
- Calculate the GPA from enrollment until the previous year.
- Calculate the target GPA for the current year.
- Output the results.

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/222k6032/GPACalcProgram.git
    cd GPACalcProgram
    ```

2. **Compile the Java program**:
    ```bash
    javac GPACalcProgram.java
    ```

3. **Run the program**:
    ```bash
    java GPACalcProgram
    ```

## Usage

1. When you run the program, you will be prompted to enter the number of credits for each grade obtained from enrollment until the previous year.
    - Input should be in half-width digits and positive integers.
    - Example:
        ```
        入学してから前年度までに取得した成績のそれぞれの単位数を半角数字で入力してください(単位認定は秀とは別に入力する)
        秀：11
        優：6
        良：6
        可：1
        単位認定：4
        ```

2. Next, you will be prompted to enter the target number of credits for each grade for the current year.
    - Example:
        ```
        今年度の取得を目標とする成績のそれぞれの単位数を半角数字で入力してください(単位認定は秀とは別に入力する)
        秀：18
        優：10
        良：2
        可：1
        単位認定：2
        ```

3. The program will then calculate and display the GPA from enrollment until the previous year and the target GPA for the current year.
    - Example output:
        ```
        入学してから前年度までの GPA: 3.25
        今年度の取得を目標としている GPA: 3.32
        ```

## Program Structure

The program is structured into several main modules:

1. **Main Module**: Controls the overall GPA calculation process.
2. **Last Year Unit Input Module**: Handles the input of the number of credits obtained from enrollment until the previous year.
3. **This Year Unit Input Module**: Handles the input of the target number of credits for the current year.
4. **Last Year GPA Calculation Module**: Calculates the GPA from enrollment until the previous year.
5. **This Year GPA Calculation Module**: Calculates the target GPA for the current year.
6. **Result Output Module**: Outputs the calculated GPA results.

## Note

- Ensure that all input values are positive integers.
- If the total number of credits entered for the current year exceeds 48, a warning message will be displayed, and you will be prompted to re-enter the values.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
