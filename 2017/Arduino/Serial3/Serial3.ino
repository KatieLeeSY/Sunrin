String inputString = "";
boolean stringComplete = false;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  inputString.reserve(200);
  Serial.write("Good afternoon~~");
}

void loop() {
  // put your main code here, to run repeatedly:
  if(stringComplete){
    Serial.println(inputString);
    inputString = "";
    stringComplete = false;
  }
}

void serialEvent(){
  while(Serial.available()){
    char inChar = (char)Serial.read();
    inputString += inChar;
    if(inChar == '\n') stringComplete = true;
  }
}

