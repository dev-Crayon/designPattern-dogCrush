import { Car } from '../Car/car';

abstract class OptionDecorator extends Car {
  constructor(car: Car) {
    super(car.model, car.cost, car.gao, car.options);
  }
}

export class SunRoof extends OptionDecorator {
  car: Car;
  constructor(car: Car) {
    super(car);
    this.car = car;
  }

  getOptions(): string {
    return this.car.getOptions() + `\n      - 썬루프`;
  }
  getCost(): number {
    return this.car.getCost() + 500;
  }
  getGao(): number {
    return this.car.getGao() + 30;
  }
}

export class AutoPilot extends OptionDecorator {
  car: Car;
  constructor(car: Car) {
    super(car);
    this.car = car;
  }
  getOptions(): string {
    return this.car.getOptions() + `\n      - 자율주행`;
  }
  getCost(): number {
    return this.car.getCost() + 1500;
  }
  getGao(): number {
    return this.car.getGao() - 50;
  }
}

export class HotButt extends OptionDecorator {
  car: Car;
  constructor(car: Car) {
    super(car);
    this.car = car;
  }
  getOptions(): string {
    return this.car.getOptions() + `\n      - 엉뜨`;
  }
  getCost(): number {
    return this.car.getCost() + 500;
  }
  getGao(): number {
    return this.car.getGao() - 100;
  }
}

export class PremiumSpeaker extends OptionDecorator {
  car: Car;
  constructor(car: Car) {
    super(car);
    this.car = car;
  }
  getOptions(): string {
    return this.car.getOptions() + `\n      - 프리미엄 스피커`;
  }
  getCost(): number {
    return this.car.getCost() + 500;
  }
  getGao(): number {
    return this.car.getGao() + 40;
  }
}

export class DRS extends OptionDecorator {
  car: Car;
  constructor(car: Car) {
    super(car);
    this.car = car;
  }

  getOptions(): string {
    return this.car.getOptions() + `\n      - DRS`;
  }
  getCost(): number {
    return this.car.getCost() + 1000;
  }
  getGao(): number {
    return this.car.getGao() + 100;
  }
}
