package state;

// Context
public class Bear {
  // State
  public enum State {
    // ConcreteState1
    NOT_SLEEPING {
      @Override
      public void attack(Bear b) {
        System.out.println("GroaaR");
      }

      @Override
      public void wakeup(Bear b) {
        throw new RuntimeException("already not sleeping");
      }
    },
    // ConcreteState2
    SLEEPING {
      @Override
      public void attack(Bear b) {
        System.out.println("Zzzzzz");
      }

      @Override
      public void sleep(Bear b) {
        throw new RuntimeException("already sleeping");
      }
    };


    public abstract void attack(Bear b);

    public void sleep(Bear b) {
      b.setState(SLEEPING);
    }

    public void wakeup(Bear b) {
      b.setState(NOT_SLEEPING);
    }
  }


  private State state;

  public Bear() {
    setState(State.NOT_SLEEPING);
  }
  public void attack() {
    state.attack(this);
    // if (state.equals("not sleeping")) System.out.println("GroaaR");
    // if (state.equals("sleeping")) System.out.println("Zzzzzz");
  }

  public void sleep() {
    state.sleep(this);
    // if (state.equals("sleeping")) throw new RuntimeException("already sleeping");
    // else setState("sleeping");
  }

  public void wakeup() {
    state.wakeup(this);
    // if (state.equals("not sleeping")) throw new RuntimeException("already not sleeping");
    // else setState("not sleeping");
  }

  public void setState(State state) {
    this.state= state;
  }
}
