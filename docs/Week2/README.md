# Week 2 – Netty Server & First Client Connection

## Overview

This week focused on building the networking foundation of the Adaptive Network Deception Engine (ANDE). The goal was to transform the project from a non-compiling prototype into a working Netty-based TCP server capable of accepting client connections.

---

## Objectives

- Configure the Netty server
- Fix project compilation issues
- Create a connection handler
- Start the server successfully
- Accept the first client connection

---

## Tasks Completed

- Fixed the Java package structure.
- Moved `Main.java` into the correct package.
- Created `ConnectionHandler.java`.
- Added the application's `main()` method.
- Resolved Maven compilation errors.
- Successfully built the project using Maven.
- Started the Netty server on **port 8080**.
- Tested the server using a local TCP client.
- Verified that client connections are accepted.
- Learned the basics of the Netty networking framework.

---

## Technologies Used

- Java 25
- Maven
- Netty
- IntelliJ IDEA
- Windows Command Prompt

---

## Commands Used

### Compile the project

```bash
mvn clean compile
```

### Run the application

```bash
mvn exec:java -Dexec.mainClass="com.ande.network.Main"
```

---

## Output

```
BUILD SUCCESS

INFO com.ande.network.Main -- ANDE listening on port 8080

Client connected:
/[0:0:0:0:0:0:0:1]:63302
```

---

## What I Learned

- How Java package structures work.
- How Maven compiles Java projects.
- The purpose of Netty and its networking components.
- How a TCP server listens for incoming connections.
- The role of a `ConnectionHandler`.
- The difference between IPv4 (`127.0.0.1`) and IPv6 (`::1`) localhost addresses.

---

## Current Status

✅ Project compiles successfully.

✅ Netty server starts correctly.

✅ Server listens on TCP port **8080**.

✅ Client connections are accepted successfully.

---

## Next Steps

During Week 3, the ANDE project will be extended to:

- Read data sent by clients.
- Detect network protocols (HTTP, SSH, FTP, etc.).
- Log client activity.
- Begin implementing honeypot behavior.

---

## Documentation

For the complete development journal, see:

**ANDE_Week2_Learning_Journal.pdf**