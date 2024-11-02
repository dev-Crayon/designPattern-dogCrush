export abstract class Car {
  public options: string;
  public model: string;
  public cost: number;
  public gao: number;

  constructor(
    type: string,
    initialCost: number,
    initialGao: number,
    options: string = ''
  ) {
    this.options = options;
    this.model = type;
    this.cost = initialCost;
    this.gao = initialGao;
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

  getDescriptions(): void {
    console.log(`
    <차량 정보>
    모델 : ${this.model}
    ${this.getOptions() ? '옵션:' + this.getOptions() : '옵션: 깡통'}
    가격: ${this.getCost()}
    가오: ${this.getGao()}`);
  }
}
