# GTNoms

## Displays food at the Georgia Tech dining halls

### Phase 1
#### Main UI
Navigation drawer in the top left corner.
"Switch view" button in the top right corner. 


2 different views

1. List View - dining hall sections are separated in rows. Under each section there are the food items with their status.
2. Card View - sort items by the most favorited iteems (possibly taking into account how long they have existed)


3 possible statuses for each food item

1. Unverified (?) - the default status for items parsed from the website or added
2. Verified (✓) - X people have verified 
3. Out (x) - Y people have verified 

Add button (either floating action button or settings bar) which lets people add a new food item.

#### Detail UI

The detail UI is opened when a food item is selected. 

Features

1. Verify (if unverified)
2. Flag as Out/Not Here
3. Flag as spam
4. Favorite

### Phase 2

Notifications when favorite foods appear in the dining hall
Login service with verified GT email addresses
