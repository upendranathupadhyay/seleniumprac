WinWait($CmdLine[1])

WinActive($CmdLine[1])
;Sleep(5000)
ControlFocus("Choose File to Upload","","Edit1")   ;get focus
Sleep(5000)
ControlSetText("Choose File to Upload","", "Edit1", "index.jpg");get filename to upload
Sleep(5000)
ControlClick("Choose File to Upload", "", "Button1");open file in browser