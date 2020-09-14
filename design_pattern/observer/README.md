The Observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any design_pattern.state changes, usually by calling one of their methods.

- Loose Coupling is a benifit
- The Subject(publisher) doesn't need to know anything about the Observers(Suscribers)
- Negatives: The Subject(Publisher) may send updates that don't matter to the Observer(subscriber)  