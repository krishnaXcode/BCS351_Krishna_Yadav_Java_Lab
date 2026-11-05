@echo off
setlocal
if "%~1"=="" (
  echo Usage: run.bat ^<assignment-number^> ^<question-number^>
  echo Example: run.bat 1 1
  exit /b 1
)
if "%~2"=="" (
  echo Please provide both assignment and question numbers.
  exit /b 1
)
set "A=%~1"
set "Q=%~2"
set "DIR=Assignment-%A%"
if %A% LSS 10 set "DIR=Assignment-0%A%"
set "QDIR=Question-%Q%"
if %Q% LSS 10 set "QDIR=Question-0%Q%"
cd /d "%~dp0%DIR%\%QDIR%" || exit /b 1
javac Main.java || exit /b 1
java Main
