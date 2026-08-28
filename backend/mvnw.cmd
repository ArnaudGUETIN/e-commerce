@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    https://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Maven Start Up Batch script
@REM
@REM Required ENV vars:
@REM JAVA_HOME - location of a JDK home dir
@REM
@REM Optional ENV vars
@REM MAVEN_BATCH_ECHO - set to 'on' to enable the echoing of the batch commands
@REM MAVEN_BATCH_PAUSE - set to 'on' to pause at the end of execution
@REM MAVEN_OPTS - parameters to passed to the Java VM when running Maven
@REM     e.g. to debug Maven itself, use
@REM set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000
@REM MAVEN_SKIP_RC - flag to disable loading of mavenrc files
@REM ----------------------------------------------------------------------------

@REM Begin all REM lines with '@' in case MAVEN_BATCH_ECHO is 'on'
@echo off
@REM set title of command prompt
title %0
@REM enable echoing by setting MAVEN_BATCH_ECHO to 'on'
@if "%MAVEN_BATCH_ECHO%" == "on"  echo %MAVEN_BATCH_ECHO%

@REM set %MODULE%&set %EXPANSION% to enable %variable:tokens%
@setlocal
@setlocal ENABLEEXTENSIONS
@setlocal ENABLEDELAYEDEXPANSION

@REM ==== START VALIDATION ====
@REM *** ToDo: need to add check for spaces in JAVA_HOME ***
@REM ***       need to add check for %~dp0 containing spaces ***

:FindJava
if not "%JAVA_HOME%" == "" goto OkJHome

for %%i in (java.exe) do set "JAVACMD=%%~$PATH:i"
if not "%JAVACMD%"=="" goto OkJavaCmd

echo.
echo Error: JAVA_HOME is not defined correctly.
echo We cannot execute %0
echo.
goto error

:OkJHome
set "JAVACMD=%JAVA_HOME%\bin\java.exe"

:OkJavaCmd
if exist "%JAVACMD%" goto init

echo.
echo Error: JAVA_HOME is set to an invalid directory.
echo JAVA_HOME = "%JAVA_HOME%"
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.
echo.
goto error

:init

@REM Find the project base dir, i.e. the dir that contains the folder ".mvn".
@REM Fallback to current working directory if not found.

set MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%
IF NOT "%MAVEN_PROJECTBASEDIR%"=="" goto endDetectBaseDir

set EXEC_DIR=%CD%
set WDIR=%EXEC_DIR%
:findBaseDir
IF EXIST "%WDIR%"\.mvn goto baseDirFound
cd ..
IF "%WDIR%"=="%CD%" goto baseDirNotFound
set WDIR=%CD%
goto findBaseDir

:baseDirFound
set MAVEN_PROJECTBASEDIR=%WDIR%
cd "%EXEC_DIR%"
goto endDetectBaseDir

:baseDirNotFound
set MAVEN_PROJECTBASEDIR=%EXEC_DIR%
cd "%EXEC_DIR%"

:endDetectBaseDir

set "WRAPPER_PROPERTIES=%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.properties"

powershell -NoProfile -ExecutionPolicy Bypass -Command "$ErrorActionPreference = 'Stop'; $wrapperProps = '%WRAPPER_PROPERTIES%'; $distributionUrl = (Get-Content $wrapperProps | Where-Object { $_ -match '^distributionUrl=' }) -replace '^distributionUrl=', ''; $distributionUrl = $distributionUrl.Trim(); $zipName = [System.IO.Path]::GetFileName($distributionUrl); $mvnVersion = ($zipName -replace '-bin\.zip', '') -replace 'apache-maven-', ''; $baseDir = Join-Path $env:USERPROFILE \".m2\wrapper\dists\$mvnVersion\"; $mvnHome = Join-Path $baseDir \"apache-maven-$mvnVersion\"; $mvnCmd = Join-Path $mvnHome 'bin\mvn.cmd'; if (-not (Test-Path $mvnCmd)) { New-Item -ItemType Directory -Force -Path $baseDir | Out-Null; $zipPath = Join-Path $baseDir $zipName; Write-Host \"Downloading Maven from $distributionUrl...\"; [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; (New-Object System.Net.WebClient).DownloadFile($distributionUrl, $zipPath); Write-Host 'Extracting Maven...'; Expand-Archive -Path $zipPath -DestinationPath $baseDir -Force; Remove-Item $zipPath -Force }; & $mvnCmd %*"
if ERRORLEVEL 1 goto error
goto end

:error
set ERROR_CODE=1

:end
@endlocal & set ERROR_CODE=%ERROR_CODE%
exit /B %ERROR_CODE%
