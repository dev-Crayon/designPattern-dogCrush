import { Command } from "..";

 // Invoker: 스마트 홈 리모컨
export class RemoteControl {
    private history: Command[] = [];
  
    executeCommand(command: Command): void {
      command.execute();
      this.history.push(command);
    }
  
    undoLastCommand(): void {
      const command = this.history.pop();
      if (command) {
        command.undo();
      }
    }
  }