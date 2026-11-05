#!/usr/bin/env bash
set -e
if [ "$#" -ne 2 ]; then
  echo "Usage: ./run.sh <assignment-number> <question-number>"
  echo "Example: ./run.sh 1 1"
  exit 1
fi
A=$(printf "%02d" "$1")
Q=$(printf "%02d" "$2")
cd "$(dirname "$0")/Assignment-$A/Question-$Q"
javac Main.java
java Main
