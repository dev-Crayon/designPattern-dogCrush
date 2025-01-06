import { Command } from "..";
import { SmartLight } from "./light-receiver";

  // Concrete Command: 조명을 켜는 명령
  export class LightOnCommand implements Command {
    private light: SmartLight;
  
    constructor(light: SmartLight) {
      this.light = light;
    }
  
    execute(): void {
      this.light.turnOn();
    }
  
    undo(): void {
      this.light.turnOff();
    }
  }
  
  // Concrete Command: 조명을 끄는 명령
  export class LightOffCommand implements Command {
    private light: SmartLight;
  
    constructor(light: SmartLight) {
      this.light = light;
    }
  
    execute(): void {
      this.light.turnOff();
    }
  
    undo(): void {
      this.light.turnOn();
    }
  }