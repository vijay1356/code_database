//MASTER CODE-- > ENTER ANY RGB VALUE IT WILL GIVE THE OUTPUT COLOR 
//eg. 255,255,255 white color will be shown in the rbg bulb 
//u need to type the input in the serial monitor
int redpin = 3;
int bluepin = 5;
int greenpin = 6;

void setup()
{
    pinMode(redpin, OUTPUT);
    pinMode(bluepin, OUTPUT);
    pinMode(greenpin, OUTPUT);
    Serial.begin(9600);
}

void loop()
{
    if (Serial.available() > 0)
    {
        String input = Serial.readStringUntil('\n');
        int comma1 = input.indexOf(',');
        int comma2 = input.indexOf(',', comma1 + 1);
        if (comma1 != -1 && comma2 != -1)
        {
            int red = input.substring(0, comma1).toInt();
            int green = input.substring(comma1 + 1, comma2).toInt();
            int blue = input.substring(comma2 + 1).toInt();
            analogWrite(redpin, red);
            analogWrite(greenpin, green);
            analogWrite(bluepin, blue);
        }
    }
}
