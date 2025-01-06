import { Command } from "..";
import { Thermostat } from "./thermostat-receiver";

  // Concrete Command: 온도 설정 명령
  export class SetTemperatureCommand implements Command {
    private thermostat: Thermostat;
    private previousTemperature: number;
    private newTemperature: number;
  
    constructor(thermostat: Thermostat, newTemperature: number) {
      this.thermostat = thermostat;
      this.previousTemperature = 20; // 기본 온도
      this.newTemperature = newTemperature;
    }
  
    execute(): void {
      this.previousTemperature = this.newTemperature; // 현재 온도를 저장
      this.thermostat.setTemperature(this.newTemperature);
    }
  
    undo(): void {
      this.thermostat.resetTemperature();
    }
  }