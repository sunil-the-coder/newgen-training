# This repo holds the codes which are developed under java training
All session codes are put up into text file for now.


# Delete unwanted macos files from windows

$ Rename the java files first

Get-ChildItem -Path . -Recurse -Filter '._*.java' | ForEach-Object {
    Rename-Item -Path $_.FullName -NewName ($_.Name -replace '._', '')
}


Delete the files - 

$ Get-ChildItem -Path . -Recurse -Filter '._*' | Remove-Item
