// Receiver: 스마트 조명
export class SmartLight {
    private isOn: boolean = false;
  
    turnOn(): void {
      this.isOn = true;
      console.log("The light is ON");
    }
  
    turnOff(): void {
      this.isOn = false;
      console.log("The light is OFF");
    }
  }