# 커맨드 패턴
- 커맨드 패턴은 행동(작업)을 캡슐화하여 요청과 실행을 분리하는 디자인 패턴

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/13ca7f00-e310-42c3-b339-eae0eb58050a/afbf6bb9-05c7-4148-a828-fe4ab3c17aa4/image.png)

## 커맨드 패턴의 구성요소

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/13ca7f00-e310-42c3-b339-eae0eb58050a/2a2fd8b5-ff82-4acd-8f1e-e54c4ccb7e43/image.png)

**Command**

- 실행할 작업에 대한 추상 인터페이스를 정의한다
- `Command` 객체에서 제공하는 메소드는 `excute()` 하나 뿐이다.
- 이 메소드에는 행동을 캡슐화하며, `Receiver`에 있는 특정 행동을 처리하기 위한 메소드를 호출하기 위한 메서드이다.

**ConcreteCommand**

- `Command` 인터페이스를 구현하여 실제 작업을 수행할 메서드를 정의한다.
- Receiver에 대한 참조를 가지고 있으며, `execute()`에서 Receiver의 작업을 호출한다.

**Client**

- `Client`는 `Command` 객체를 생성해야 한다.
    - `Command` 객체는 `Receiver`에 전달할 일련의 행동으로 구성된다.
- 생성한 `Command` 객체는 `Invoker` 에 전달한다

Receiver

- 실제로 작업을 수행하는 개체이다
- `Command` 객체에는 행동과 `Receiver`에 대한 정보가 같이 들어 있다.
- `ConcreteCommand`가 호출하는 메서드를 가지고 있다.

**Invoker**

- 명령 객체를 보유하고, 명령의 실행을 요청한다
- `Client`에서는 `Invoker` 객체의 `setCommand()` 메소드를 호출하는데, 이 때 Command 객체를 넘겨준다.
- 그 `Command` 객체는 나중에 쓰기 전까지 `Invoker` 객체에 보관된다.
- `Invoker`에서 `Command` 객체의 `excute()` 메소드를 호출하면 `Receiver`에 있는 특정 행동을 하는 메소드가 호출된다.

### 커맨드 패턴의 작동 과정

1. **`Client`**는 실행하려는 작업을 캡슐화한 **`ConcreteCommand`**를 생성한다
2. **`Invoker`**는 `ConcreteCommand`를 받아 저장하고, 필요시 `execute()`를 호출한다.
3. **`ConcreteCommand`**는 작업 수행을 위해 **`Receiver`**의 메서드를 호출한다.
4. **`Receiver`**는 실제 작업을 수행한다.

### 커맨드 패턴의 장단점

장점

- 요청과 실행의 결합도가 감소된다
- 작업의 확장성이 높다
- 작업의 기록, 취소, 재실행 등이 용이하다

단점

- Command 객체가 많아질 경우 코드의 복잡성이 증가한다