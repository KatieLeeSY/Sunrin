int potpin1 = 0;
int potpin2 = 1;
int ledpin1 = 9;
int ledpin2 = 10;
int val1;
int val2;

void setup() {
  // put your setup code here, to run once:
  pinMode(ledpin1, OUTPUT);
  pinMode(ledpin2, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  val1 = analogRead(potpin1);
  analogWrite(ledpin1, val1/4);
  val2 = analogRead(potpin2);
  analogWrite(ledpin2, val2/4);
}
