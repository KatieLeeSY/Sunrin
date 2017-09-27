int red = 9;
int green = 10;
int blue = 11;

void setup() {
  // put your setup code here, to run once:
  pinMode(red, OUTPUT);
  pinMode(green, OUTPUT);
  pinMode(blue, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  for(int i=0;i<256;i++){
    for(int j=0;j<256;j++){
      for(int k=0;k<256;k++){
        analogWrite(red,i);
        analogWrite(green,i);
        analogWrite(blue,i);
      }
    }
  }
}
