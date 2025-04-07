@echo off
:: Prompt user for project number and optional letter
set /p proj_num=Enter the project number (e.g., 1, 2, 6, etc.): 
set /p proj_letter=Enter the optional letter (leave blank if none): 

:: sets username
set user=27radtker

:: Set the base directory
set base_dir=C:\Users\%user%\Desktop\Honors-Programming\Ruby

:: Build the full directory name
set full_dir=Ruby%proj_num%

:: Change to the correct directory based on the input
cd /d "%base_dir%\%full_dir%"

:: Check if the directory exists
if exist "%base_dir%\%full_dir%" (
    echo Changing to directory: %base_dir%\%full_dir%
    :: Run the corresponding ruby script (ruby1.rb, ruby2.rb, ruby6a.rb, ruby6b.rb, etc.)
    ruby ruby%proj_num%%proj_letter%.rb
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

:: Keep the command prompt open
echo.    
echo.
pause
:: Rerun program
set proj_letter=
cls
cd C:\Users\%user%\Desktop
.\run_ruby.bat.lnk