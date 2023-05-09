# Mankin

```         ___      ,---.       .-._          ,--.-.,-.     .=-.-.  .-._         
  .-._ .'=.'\   .--.'  \     /==/ \  .-._  /==/- |\  \   /==/_ / /==/ \  .-._  
 /==/ \|==|  |  \==\-/\ \    |==|, \/ /, / |==|_ `/_ /  |==|, |  |==|, \/ /, / 
 |==|,|  / - |  /==/-|_\ |   |==|-  \|  |  |==| ,   /   |==|  |  |==|-  \|  |  
 |==|  \/  , |  \==\,   - \  |==| ,  | -|  |==|-  .|    |==|- |  |==| ,  | -|  
 |==|- ,   _ |  /==/ -   ,|  |==| -   _ |  |==| _ , \   |==| ,|  |==| -   _ |  
 |==| _ /\   | /==/-  /\ - \ |==|  /\ , |  /==/  '\  |  |==|- |  |==|  /\ , |  
 /==/  / / , / \==\ _.\=\.-' /==/, | |- |  \==\ /\=\.'  /==/. /  /==/, | |- |  
 `--`./  `--`   `--`         `--`./  `--`   `--`        `--`-`   `--`./  `--`  
```                                                 
 
### Parody of the card game "Munchkins Deluxe"
##### Developed by some highschool students in an honours computer science class lmao
<br />

## File Structures
### Cards

<table>
  <tr>
    <th>Doors</th>
    <th>Treasures</th>
    <th>Curses</th>
  </tr>
  <tr>
    <td>
      <br />
      <table>
        <tr>
          <th>Key</th>
          <th>Value</th>
          <th>Notes</th>
        </tr>
        <tr>
          <td>n</td>
          <td>name</td>
          <td>(Edit to the correct structure).</td>
        </tr>
        <tr>
          <td>b</td>
          <td>level</td>
          <td />
        </tr>
        <tr>
          <td>t</td>
          <td>treasures</td>
          <td />
        </tr>
        <tr>
          <td>d</td>
          <td>description</td>
          <td />
        </tr>
      </table>
      <br />
    </td>
    <td>
      <br />
      <table>
        <tr>
          <th>Key</th>
          <th>Value</th>
          <th>Notes</th>
        </tr>
        <tr>
          <td>n</td>
          <td>name</td>
          <td />
        </tr>
        <tr>
          <td>b</td>
          <td>bonus</td>
          <td>int, or 'GUAL' if level-up</td>
        </tr>
        <tr>
          <td>r</td>
          <td>run bonus</td>
          <td />
        </tr>
        <tr>
          <td>L</td>
          <td>location</td>
          <td>head = 0; body = 1; hands = 2; feet = 3</td>
        </tr>
        <tr>
          <td>g</td>
          <td>sell amount</td>
          <td />
        </tr>
        <tr>
          <td>d</td>
          <td>description</td>
          <td />
        </tr>
      </table>
      <br />
    </td>
    <td>
      <br />
      <table>
        <tr>
          <th>Key</th>
          <th>Value</th>
          <th>Notes</th>
        </tr>
        <tr>
          <td>n</td>
          <td>name</td>
          <td />
        </tr>
        <tr>
          <td>a</td>
          <td>action</td>
          <td>GDAL | ATK | RUN| REM | CAR | ETX | LAL</td>
        </tr>
        <tr>
          <td>e</td>
          <td>effect amount</td>
          <td />
        </tr>
        <tr>
          <td>d</td>
          <td>description</td>
          <td />
        </tr>
      </table>
      <br />
    </td>
  </tr>
</table>

<br />

Example Of Inventory Information
```
=======================     =======================
| Andrew Tate's Sword |     |     Grippy Socks    |
|======< Hands >======|     |=====< Footwear >====|
|---------------------|     |---------------------|
| Attack: +1          |     | Attack: -10         |
| Run:    +0          |     | Run:    +5          |
| Value:  600         |     | Value:  200         |
=======================     =======================
```

<br />

## Developers

<table>
  <tr>
    <th>Name</th>
    <th>Role</th>
  </tr>
  <tr>
    <td>Jacob C</td>
    <td>Lead Programmer</td>
  </tr>
  <tr>
    <td>Brody M</td>
    <td>Treasure Cards Assembly & Implementation, Github Manager</td>
  </tr>
  <tr>
    <td>Jonathan C</td>
    <td>Door Cards Assembly & Implementation</td>
  </tr>
  <tr>
    <td>Bradley Sengele</td>
    <td>Supreme Helper Robot, Curse Cards</td>
  </tr>
  <tr>
    <td>Brian C</td>
    <td>Player Class</td>
  </tr>
  <tr>
    <td>David M</td>
    <td>Player Class</td>
  </tr>
  <tr>
    <td>Keenan G</td>
    <td>CodeCheck</td>
  </tr>
</table>

<br />

<table>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Fight Bonus</th>
    <th>Run Bonus</th>
    <th>Location on Body</th>
    <th>Gold Value</th>
    <th>Description</th>
    <th>Notes</th>
  </tr>
  <tr>
    <td>#0</td>
    <td>Example Treasure</td>
    <td>Integer</td>
    <td>Integer</td>
    <td>Integer; Head = 0; Left = 1; Right = 2; Armor = 3; Footwear = 4; Out-of-body = -1</td>
    <td>Integer</td>
    <td>Description for in-game clarity</td>
    <td>Extra notes for development use</td>
  </tr>
</table>
