@echo off
:: Prompt user for project number and optional letter
set /p proj_num=Enter the project number (e.g., 1, 2, 6, etc.): 
set /p proj_letter=Enter the optional letter (leave blank if none): 

set user=27radtker

:: Set the base directory
set base_dir=C:\Users\%user%\Desktop\Honors-Programming\Python

:: Build the full directory name
set full_dir=Python%proj_num%

:: Change to the correct directory based on the input
cd C:\\Program Files (x86)\\Python312-32

:: Check if the directory exists
if exist "%base_dir%\%full_dir%" (
    echo Changing to directory: %base_dir%\%full_dir%
    :: Run the corresponding ruby script (ruby1.rb, ruby2.rb, ruby6a.rb, ruby6b.rb, etc.)
    .\python.exe -m idlelib  %base_dir%\%full_dir%\python%proj_num%%proj_letter%.py
) else (
    echo The directory %full_dir% does not exist!
)

:: Keep the command prompt open
echo.    
echo.
pause
:: Rerun program
set proj_letter=
cls
cd C:\Users\%user%\Desktop
.\run_ruby.bat.lnk
