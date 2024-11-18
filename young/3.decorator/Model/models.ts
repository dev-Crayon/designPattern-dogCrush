import { Car } from '../Car/car';

export class Cedan extends Car {
  constructor() {
    super('Cedan', 2500, 100);
  }
  getCost(): number {
    return this.cost;
  }
  getGao(): number {
    return this.gao;
  }

  getOptions(): string {
    return this.options;
  }
}

export class SUV extends Car {
  constructor() {
    super('SUV', 3000, 150);
  }
  getCost(): number {
    return this.cost;
  }
  getGao(): number {
    return this.gao;
  }
}

export class Coupe extends Car {
  constructor() {
    super('Coupe', 4000, 200);
  }
  getCost(): number {
    return this.cost;
  }
  getGao(): number {
    return this.gao;
  }
}
