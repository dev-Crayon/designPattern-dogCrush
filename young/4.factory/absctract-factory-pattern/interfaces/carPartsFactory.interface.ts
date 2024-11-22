import { Engine } from './engine.interface';
import { Tire } from './tire.interface';

export interface CarPartsFactory {
  createEngine(): Engine;
  createTire(): Tire;
}
