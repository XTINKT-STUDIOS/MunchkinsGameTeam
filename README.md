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

## Treasures Index

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
  <tr>
    <td>#1</td>
    <td>Sneaky Bastard Sword</td>
    <td>2</td>
    <td>0</td>
    <td>2</td>
    <td>400</td>
    <td>Good description here (trust me)</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#2</td>
    <td>Short Wide Armour</td>
    <td>3</td>
    <td>0</td>
    <td>1</td>
    <td>400</td>
    <td>Who was this even made for?!?!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#3</td>
    <td>Hammer of Kneecappening</td>
    <td>4</td>
    <td>0</td>
    <td>2</td>
    <td>600</td>
    <td>The kneecappening is happening</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#4</td>
    <td>Eleven-Foot Pole</td>
    <td>1</td>
    <td>0</td>
    <td>2</td>
    <td>200</td>
    <td>Why are there so many feet on this pole...</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#5</td>
    <td>Rat on a Stick</td>
    <td>1</td>
    <td>0</td>
    <td>2</td>
    <td>0</td>
    <td>It's a rat... on a stick!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#6</td>
    <td>Broad Sword</td>
    <td>3</td>
    <td>0</td>
    <td>2</td>
    <td>400</td>
    <td>Is this even practical?</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#7</td>
    <td>Flaming Armour</td>
    <td>2</td>
    <td>0</td>
    <td>1</td>
    <td>400</td>
    <td>Does anyone smell burnt chicken...?</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#8</td>
    <td>Singing & Dancing Sword</td>
    <td>2</td>
    <td>0</td>
    <td>-1</td>
    <td>400</td>
    <td>I'MMMMM GONNNAAA SWINGGGGG FROM THE CHANDELIERRRRRRRRRR</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#9</td>
    <td>Really Impressive Title</td>
    <td>3</td>
    <td>0</td>
    <td>-1</td>
    <td>0</td>
    <td>"Monocle Gentlesir"</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#10</td>
    <td>Horny Helmet</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>600</td>
    <td>Get your head out of the gutter.... and that helmet!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#11</td>
    <td>Stepladder</td>
    <td>3</td>
    <td>0</td>
    <td>-1</td>
    <td>400</td>
    <td>There's a joke here; I can't make it, but it's there.</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#12</td>
    <td>Gentlemen's Club</td>
    <td>3</td>
    <td>0</td>
    <td>2</td>
    <td>400</td>
    <td>Magic Mike has something to say about this...</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#13</td>
    <td>Buckler of Swashing</td>
    <td>2</td>
    <td>0</td>
    <td>2</td>
    <td>400</td>
    <td>You've rendered my timbers shivered!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#14</td>
    <td>Staff of Napalm</td>
    <td>5</td>
    <td>0</td>
    <td>2</td>
    <td>800</td>
    <td>Napalm... that sounds famili-!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#15</td>
    <td>Slimey Armour</td>
    <td>1</td>
    <td>0</td>
    <td>1</td>
    <td>200</td>
    <td>Ewwww this must've been in Shrek's swamp</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#16</td>
    <td>Mithril Armour</td>
    <td>3</td>
    <td>0</td>
    <td>1</td>
    <td>600</td>
    <td>What makes it so heavy?</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#17</td>
    <td>Helm of Courage</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>200</td>
    <td>It's sqeezing my braincells!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#18</td>
    <td>Bow with Ribbons</td>
    <td>4</td>
    <td>0</td>
    <td>2</td>
    <td>800</td>
    <td>Hi! I'm Jojo Siwa, and my life... is pretty crazy!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#19</td>
    <td>Cloak of Obscurity</td>
    <td>4</td>
    <td>0</td>
    <td>1</td>
    <td>600</td>
    <td>YOU CANT SEE ME! *waves hand violently in front of face*</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#20</td>
    <td>Swiss Army Polearm</td>
    <td>4</td>
    <td>0</td>
    <td>2</td>
    <td>600</td>
    <td>This military veteran from Switzerland is ready to fight any monster in your way!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#21</td>
    <td>Spiky Knees</td>
    <td>1</td>
    <td>0</td>
    <td>3</td>
    <td>200</td>
    <td>That's a knee slapper.... ouch!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#22</td>
    <td>Pointy Hat of Power</td>
    <td>3</td>
    <td>0</td>
    <td>0</td>
    <td>400</td>
    <td>NOT THAT POINTY HAT, WRONG POINTY HAT!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#23</td>
    <td>Leather Armour</td>
    <td>1</td>
    <td>0</td>
    <td>1</td>
    <td>200</td>
    <td>Something tells me this armour is in high demand within a certain audience...</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#24</td>
    <td>Cheese Grater of Peace</td>
    <td>3</td>
    <td>0</td>
    <td>2</td>
    <td>400</td>
    <td>You better pray yor lactose intolerance runs away faster than you can >:)</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#25</td>
    <td>Dagger of Tree Archery</td>
    <td>3</td>
    <td>0</td>
    <td>2</td>
    <td>400</td>
    <td>Gosh, I feel like someone is shooting daggers at me... OH WAI-!</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#26</td>
    <td>Chainsaw of Bloody Dismemberment</td>
    <td>3</td>
    <td>0</td>
    <td>2</td>
    <td>600</td>
    <td>We did specify *fake* props for halloween... right?</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#27</td>
    <td>Limburger and Anchovy Sandwich</td>
    <td>3</td>
    <td>0</td>
    <td>-1</td>
    <td>400</td>
    <td>Anyone who eats this will projectile vomit instantanously</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#28</td>
    <td>Shield of Ubiquity</td>
    <td>4</td>
    <td>0</td>
    <td>2</td>
    <td>600</td>
    <td>Wait, this isn't the faulty batch... right?</td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#29</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#30</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#31</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#32</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#33</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#34</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#35</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#36</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#37</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#38</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#39</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#40</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#41</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#42</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#43</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#44</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#45</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#46</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#47</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#48</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#49</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#50</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#51</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#52</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#53</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#54</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>From the actual game Munchkin</td>
  </tr>
  <tr>
    <td>#55</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#56</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#57</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#58</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#59</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#60</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#61</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#62</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#63</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#64</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#65</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#66</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#67</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#68</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#69</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#70</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#71</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#72</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#73</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#74</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#75</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#76</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#77</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#78</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#79</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#80</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#81</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#82</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#83</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#84</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#85</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#86</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#87</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#88</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#89</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#90</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#91</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#92</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#93</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#94</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#95</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#96</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#97</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#98</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#99</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
  <tr>
    <td>#100</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>00</td>
    <td></td>
    <td>Custom Made by a Mankin Developer</td>
  </tr>
</table>

<br />

## Monsters Index

<table>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Level</th>
    <th>Treasures</th>
    <th>Description</th>
    <th>Notes</th>
  </tr>
  <tr>
    <td>#0</td>
    <td>Example Monster</td>
    <td>Integer</td>
    <td>Integer</td>
    <td>Description for in-game clarity</td>
    <td>Extra notes for development use</td>
  </tr>
</table>
