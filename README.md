# Gaptic example

This is an example of an SBT project containing a proof developed in the gaptic
tactics language from the [GAPT framework](https://github.com/gapt/gapt).  Feel
free to use it as a template to start your own proofs in GAPT!

## How to use it

Install [sbt](https://www.scala-sbt.org/) and run the following command:
```
sbt '~run-main example'
```

Now SBT will check the the proofs in `example.scala` every time you save the
file.  Experiment, add new lemmas, and see what happens!

## Dependencies

This project requires the 2.1-SNAPSHOT version of GAPT, which is not yet
released.  In the meantime, you have to install GAPT manually:
```
git clone https://github.com/gapt/gapt
cd gapt
sbt publish-local
```
