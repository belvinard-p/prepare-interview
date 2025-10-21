# Encapsulation (Bundling & Hiding)

**Concept:** Encapsulation is the bundling of data (attributes/properties) and the methods (functions/behaviors) that operate on that data into a single unit (an object). It also involves data hiding, meaning that the internal state of an object is protected from direct external access and modification. Instead, external access is controlled through well-defined public methods.

**Analogy:** Think of a smartphone.

- **Encapsulation:** The phone has internal components (battery, CPU, memory) and data (your photos, contacts). It also has operations (make a call, take a photo, send a message). All of this is bundled into one physical device.

- **Data Hiding:** You can't directly manipulate the battery or CPU from the outside. You interact with the phone through its buttons, touchscreen, and apps – these are its public methods. You don't need to know how the battery works to charge it, just that it charges when you plug it in.

**Benefits:**
- **Control:** You control how the data can be accessed and modified.
- **Validation:** You can add logic (like checking for positive amounts) within methods to ensure data integrity.
- **Flexibility:** You can change the internal implementation of a method without affecting how other parts of the code use the object (as long as the public method signature stays the same).