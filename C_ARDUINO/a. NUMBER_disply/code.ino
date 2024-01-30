//writing code using chatgpt is not a big deal or a mistake in coding
//you need to have enf knowledge to analysis the code .
//it is stupidity to write repetitive code in this era of technology.
//understand the basics of the language .ino and u r ready for chatgpt blindly pasting gpt code never give a proper output nor make u expert

int A = 2;
int B = 3;
int C = 4;
int D = 5;
int E = 6;
int F = 7;
int G = 8;
int DP = 13;

void setup()
{
    pinMode(A, OUTPUT);
    pinMode(B, OUTPUT);
    pinMode(C, OUTPUT);
    pinMode(D, OUTPUT);
    pinMode(E, OUTPUT);
    pinMode(F, OUTPUT);
    pinMode(G, OUTPUT);
    pinMode(DP, OUTPUT);
    Serial.begin(9600); // initialize serial communication
}

void loop()
{
    if (Serial.available() > 0) // check if data is available on serial port
    {
        int number = Serial.parseInt(); // read the number from serial port
        switch (number)                 // display the number on the seven-segment display
        {
        case 0:
            digitalWrite(A, LOW);
            digitalWrite(B, LOW);
            digitalWrite(C, LOW);
            digitalWrite(D, LOW);
            digitalWrite(E, LOW);
            digitalWrite(F, LOW);
            digitalWrite(G, HIGH);
            digitalWrite(DP, HIGH);
            break;
        case 1:
            digitalWrite(A, HIGH);
            digitalWrite(B, LOW);
            digitalWrite(C, LOW);
            digitalWrite(D, HIGH);
            digitalWrite(E, HIGH);
            digitalWrite(F, HIGH);
            digitalWrite(G, HIGH);
            digitalWrite(DP, HIGH);
            break;
        case 2:
            digitalWrite(A, LOW);
            digitalWrite(B, LOW);
            digitalWrite(C, HIGH);
            digitalWrite(D, LOW);
            digitalWrite(E, LOW);
            digitalWrite(F, HIGH);
            digitalWrite(G, LOW);
            digitalWrite(DP, HIGH);
            break;
        case 3:
            digitalWrite(A, LOW);
            digitalWrite(B, LOW);
            digitalWrite(C, LOW);
            digitalWrite(D, LOW);
            digitalWrite(E, HIGH);
            digitalWrite(F, HIGH);
            digitalWrite(G, LOW);
            digitalWrite(DP, HIGH);
            break;
        case 4:
            digitalWrite(A, HIGH);
            digitalWrite(B, LOW);
            digitalWrite(C, LOW);
            digitalWrite(D, HIGH);
            digitalWrite(E, HIGH);
            digitalWrite(F, LOW);
            digitalWrite(G, LOW);
            digitalWrite(DP, HIGH);
            break;
        case 5:
            digitalWrite(A, LOW);
            digitalWrite(B, HIGH);
            digitalWrite(C, LOW);
            digitalWrite(D, LOW);
            digitalWrite(E, HIGH);
            digitalWrite(F, LOW);
            digitalWrite(G, LOW);
            digitalWrite(DP, HIGH);
            break;
        case 6:
            digitalWrite(A, LOW);
            digitalWrite(B, HIGH);
            digitalWrite(C, LOW);
            digitalWrite(D, LOW);
            digitalWrite(E, LOW);
            digitalWrite(F, LOW);
            digitalWrite(G, LOW);
            digitalWrite(DP, HIGH);
            break;
        case 7:
            digitalWrite(A, LOW);
            digitalWrite(B, LOW);
            digitalWrite(C, LOW);
            digitalWrite(D, HIGH);
            digitalWrite(E, HIGH);
            digitalWrite(F, HIGH);
            digitalWrite(G, HIGH);
            digitalWrite(DP, HIGH);
            break;
        case 8:
            digitalWrite(A, LOW);
            digitalWrite(B, LOW);
            digitalWrite(C, LOW);
            digitalWrite(D, LOW);
            digitalWrite(E, LOW);
            digitalWrite(F, LOW);
            digitalWrite(G, LOW);
            digitalWrite(DP, HIGH);
            break;
        case 9:
            digitalWrite(A, LOW);
            digitalWrite(B, LOW);
            digitalWrite(C, LOW);
            digitalWrite(D, LOW);
            digitalWrite(E, HIGH);
            digitalWrite(F, LOW);
            digitalWrite(G, LOW);
            digitalWrite(DP, HIGH);
            break;
        default:
            break;
        }
    }
}
